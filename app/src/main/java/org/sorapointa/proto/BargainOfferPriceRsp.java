package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainResultType.*;
import org.sorapointa.proto.BargainResultType;

public class BargainOfferPriceRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer resultParam = null;
    @Tag(tag=14) public Integer bargainResult = null;
    @Tag(tag=6,isSigned=true) public Integer curMood = null;
}
