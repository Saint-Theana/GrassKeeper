package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum WidgetCreatorOpType {
        @Tag(tag=0) WIDGET_CREATOR_OP_TYPE_NONE ,
        @Tag(tag=1) WIDGET_CREATOR_OP_TYPE_RETRACT ,
        @Tag(tag=2) WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE ;
}
