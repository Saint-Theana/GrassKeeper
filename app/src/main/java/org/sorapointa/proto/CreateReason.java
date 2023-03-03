package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CreateReason {
        @Tag(tag=0) CREATE_REASON_NONE ,
        @Tag(tag=1) CREATE_REASON_QUEST ,
        @Tag(tag=2) CREATE_REASON_ENERGY ;
}
