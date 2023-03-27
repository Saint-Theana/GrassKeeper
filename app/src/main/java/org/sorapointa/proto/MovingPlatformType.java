package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MovingPlatformType {
        @Tag(tag=0) MovingPlatformNone ,
        @Tag(tag=1) MovingPlatformUseConfig ,
        @Tag(tag=2) MovingPlatformAbility ,
        @Tag(tag=3) MovingPlatformRoute ;
}
