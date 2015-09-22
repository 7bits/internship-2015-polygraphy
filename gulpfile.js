'use strict';

var gulp = require('gulp'),
    autoprefixer = require('gulp-autoprefixer'),
    browsersync = require('browser-sync'),
    minifyCss = require('gulp-minify-css'),
    rigger = require('gulp-rigger'),
    uglify = require('gulp-uglify'),
    sourcemaps = require('gulp-sourcemaps'),
    reload = browsersync.reload;

var path = {
    build: { //Тут мы укажем куда складывать готовые после сборки файлы
        js: 'src/main/resources/public/build/scripts/',
        css: 'src/main/resources/public/build/stylesheets/',
        img: 'src/main/resources/public/build/images/',
        fonts: 'src/main/resources/public/build/fonts/'
    },
    src: { //Пути откуда брать исходники
        js: 'src/main/resources/public/scripts/main.js',
        style: 'src/main/resources/public/stylesheets/main.css',
        img: 'src/main/resources/public/images/**/*.*',
        fonts: 'src/main/resources/public/fonts/**/*.*'
    },
    watch: { //Тут мы укажем, за изменением каких файлов мы хотим наблюдать
        js: 'src/main/resources/public/scripts/**/*.js',
        style: 'src/main/resources/public/stylesheets/**/*.css',
        img: 'src/main/resources/public/images/**/*.*',
        fonts: 'src/main/resources/public/fonts/**/*.*'
    },
    clean: './build'
};

var config = {
    server: {
        baseDir: './build'
    },
    tunnel: true,
    host: 'localhost',
    port: 9000,
    logPrefix: 'Frontend_Devil'
};

gulp.task('js:build', function () {
    gulp.src(path.src.js) //Найдем наш main файл
        .pipe(rigger()) //Прогоним через rigger
        .pipe(sourcemaps.init()) //Инициализируем sourcemap
        .pipe(uglify()) //Сожмем наш js
        .pipe(sourcemaps.write()) //Пропишем карты
        .pipe(gulp.dest(path.build.js)) //Выплюнем готовый файл в build
        .pipe(reload({stream: true})); //И перезагрузим сервер
});

gulp.task('css:build', function () {
    gulp.src(path.src.style) //Выберем наш main.css
        .pipe(rigger())
        .pipe(sourcemaps.init()) //То же самое что и с js
        //.pipe(autoprefixer()) //Добавим вендорные префиксы
        .pipe(minifyCss({processImport: false})) //Сожмем
        .pipe(sourcemaps.write())
        .pipe(gulp.dest(path.build.css)) //И в build
        .pipe(reload({stream: true}));
});

gulp.task('static:watch', function () {
    gulp.watch(path.watch.js, ['js:build']);
    gulp.watch(path.watch.style, ['css:build']);
});