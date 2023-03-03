package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BargainResultType {
        @Tag(tag=0) BARGAIN_RESULT_TYPE_COMPLETE_SUCC ,
        @Tag(tag=1) BARGAIN_RESULT_TYPE_SINGLE_FAIL ,
        @Tag(tag=2) BARGAIN_RESULT_TYPE_COMPLETE_FAIL ;
}
