package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HitColliderType {
        @Tag(tag=0) HIT_COLLIDER_TYPE_INVALID ,
        @Tag(tag=1) HIT_COLLIDER_TYPE_HIT_BOX ,
        @Tag(tag=2) HIT_COLLIDER_TYPE_WET_HIT_BOX ,
        @Tag(tag=3) HIT_COLLIDER_TYPE_HEAD_BOX ;
}
