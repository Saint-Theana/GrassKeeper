package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BargainResultType {
        @Tag(tag=0) BargainCompleteSucc ,
        @Tag(tag=1) BargainSingleFail ,
        @Tag(tag=2) BargainCompleteFail ;
}
