/**
 * @license Copyright (c) 2003-2015, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config )
{
   // config.language = 'fr';
    config.uiColor = '#64be5f';

    config.toolbarGroups = [
		{ name: 'document', groups: [ 'mode', 'document', 'doctools' ] },
		{ name: 'clipboard', groups: [ 'clipboard', 'undo' ] },

		{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
		{ name: 'paragraph', groups: [ 'list', 'indent', 'blocks', 'align', 'bidi', 'paragraph' ] },
		{ name: 'links', groups: [ 'links' ] },

	];

	config.removeButtons = 'Source,Save,Preview,NewPage,Print,Templates,Cut,Copy,PasteText,Paste,Find,Replace,SelectAll,Checkbox,Form,Radio,TextField,Textarea,Select,Button,ImageButton,HiddenField,Strike,RemoveFormat,Blockquote,CreateDiv,BidiLtr,BidiRtl,Unlink,Anchor,Flash,Image,Table,Smiley,PageBreak,Iframe,BGColor,TextColor,Maximize,ShowBlocks,About,PasteFromWord,Language,Subscript,Superscript';
};