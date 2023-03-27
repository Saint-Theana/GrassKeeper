package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum Achievement_Status {
        @Tag(tag=0) Invalid ,
        @Tag(tag=1) Unfinished ,
        @Tag(tag=2) Finished ,
        @Tag(tag=3) RewardTaken ;
}
