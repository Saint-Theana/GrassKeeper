package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FoundationStatus {
        @Tag(tag=0) FOUNDATION_STATUS_NONE ,
        @Tag(tag=1) FOUNDATION_STATUS_INIT ,
        @Tag(tag=2) FOUNDATION_STATUS_BUILDING ,
        @Tag(tag=3) FOUNDATION_STATUS_BUILT ;
}
