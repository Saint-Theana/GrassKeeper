package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BreakoutActionType {
        @Tag(tag=0) ActionTypeNone ,
        @Tag(tag=1) ActionTypeLaunchBall ,
        @Tag(tag=2) ActionTypeDestroyBall ,
        @Tag(tag=3) ActionTypeFallingObject ,
        @Tag(tag=4) ActionTypeMissile ;
}
