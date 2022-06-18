package com.angxd.enhancedcraft.item.client.renderer;

import com.angxd.enhancedcraft.item.client.model.TitaniumTrapItemModel;
import com.angxd.enhancedcraft.item.custom.TitaniumTrapItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class TitaniumTrapItemRenderer extends GeoItemRenderer<TitaniumTrapItem> {
    public TitaniumTrapItemRenderer() {
        super(new TitaniumTrapItemModel());
    }
}
