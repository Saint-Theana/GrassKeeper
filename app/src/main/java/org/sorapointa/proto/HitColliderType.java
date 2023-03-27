package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HitColliderType {
        @Tag(tag=0) HitColliderInvalid ,
        @Tag(tag=1) HitColliderHitBox ,
        @Tag(tag=2) HitColliderWetHitBox ,
        @Tag(tag=3) HitColliderHeadBox ;
}
