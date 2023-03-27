package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerQuitFromHomeNotify_QuitReason {
        @Tag(tag=0) Invalid ,
        @Tag(tag=1) KickByHost ,
        @Tag(tag=2) BackToMyWorld ,
        @Tag(tag=3) HomeBlocked ,
        @Tag(tag=4) HomeInEditMode ,
        @Tag(tag=5) ByMuip ,
        @Tag(tag=6) CurModuleClosed ;
}
