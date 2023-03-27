package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SettleReason {
        @Tag(tag=0) TimeOut ,
        @Tag(tag=1) SettlePlayEnd ,
        @Tag(tag=2) SettlePlayerQuit ,
        @Tag(tag=3) SettleLifeCount ;
}
