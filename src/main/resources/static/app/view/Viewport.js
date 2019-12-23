Ext.define('ESMG.view.Viewport', {
	extend: 'Ext.container.Viewport',
    requires: ['ESMG.view.general.TabPanel'],
	layout: 'border',
	config: {
		items: [

                 		{
                 			region: 'north',
                 			xtype: 'maintabpanel'
                 		}
		]
	}
});