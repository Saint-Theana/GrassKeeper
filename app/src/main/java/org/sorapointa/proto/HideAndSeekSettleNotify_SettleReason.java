package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HideAndSeekSettleNotify_SettleReason {
        @Tag(tag=0) TimeOut ,
        @Tag(tag=1) SettlePlayEnd ,
        @Tag(tag=2) SettlePlayerQuit ;
}
