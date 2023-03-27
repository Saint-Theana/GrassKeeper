package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGSettleOption {
        @Tag(tag=0) GCGSettleOptNone ,
        @Tag(tag=1) GCGSettleOptExit ,
        @Tag(tag=2) GCGSettleOptContinue ,
        @Tag(tag=3) GCGSettleOptRestart ;
}
