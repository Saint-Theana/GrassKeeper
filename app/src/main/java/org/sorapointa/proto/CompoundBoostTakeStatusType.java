package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CompoundBoostTakeStatusType {
        @Tag(tag=0) CompoundBoostTakeStatusNone ,
        @Tag(tag=1) CompoundBoostTakeStatusBoostOnly ,
        @Tag(tag=2) CompoundBoostTakeStatusBoostAndTake ,
        @Tag(tag=3) CompoundBoostTakeStatusBagFull ;
}
