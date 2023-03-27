package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerApplyEnterHomeResultNotify_Reason {
        @Tag(tag=0) PlayerJudge ,
        @Tag(tag=1) PlayerEnterOptionRefuse ,
        @Tag(tag=2) PlayerEnterOptionDirect ,
        @Tag(tag=3) SystemJudge ,
        @Tag(tag=4) HostInMatch ,
        @Tag(tag=5) PsPlayerNotAcceptOthers ,
        @Tag(tag=6) OpenStateNotOpen ,
        @Tag(tag=7) HostInEditMode ,
        @Tag(tag=8) PriorCheck ;
}
