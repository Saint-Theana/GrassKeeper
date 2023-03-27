package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerMatchAgreedResultNotify_Reason {
        @Tag(tag=0) Succ ,
        @Tag(tag=1) TargetSceneCannotEnter ,
        @Tag(tag=2) SelfMpUnavailable ,
        @Tag(tag=3) OtherDataVersionNotLatest ,
        @Tag(tag=4) DataVersionNotLatest ;
}
