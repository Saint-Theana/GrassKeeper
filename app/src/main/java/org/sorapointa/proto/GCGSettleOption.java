package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGSettleOption {
        @Tag(tag=0) GCG_SETTLE_OPTION_OPT_NONE ,
        @Tag(tag=1) GCG_SETTLE_OPTION_OPT_EXIT ,
        @Tag(tag=2) GCG_SETTLE_OPTION_OPT_CONTINUE ,
        @Tag(tag=3) GCG_SETTLE_OPTION_OPT_RESTART ;
}
