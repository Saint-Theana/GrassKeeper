package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum WidgetCreatorOpType {
        @Tag(tag=0) WidgetCreatorTypeNone ,
        @Tag(tag=1) WidgetCreatorTypeRetract ,
        @Tag(tag=2) WidgetCreatorTypeRetractAndCreate ;
}
