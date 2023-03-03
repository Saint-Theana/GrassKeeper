package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BonusActivityInfo.*;
import org.sorapointa.proto.BonusActivityInfo;

public class GetBonusActivityRewardRsp {
    @Tag(tag=4) public BonusActivityInfo bonusActivityInfoList = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
