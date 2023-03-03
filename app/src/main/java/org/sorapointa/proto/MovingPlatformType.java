package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MovingPlatformType {
        @Tag(tag=0) MOVING_PLATFORM_TYPE_NONE ,
        @Tag(tag=1) MOVING_PLATFORM_TYPE_USE_CONFIG ,
        @Tag(tag=2) MOVING_PLATFORM_TYPE_ABILITY ,
        @Tag(tag=3) MOVING_PLATFORM_TYPE_ROUTE ;
}
