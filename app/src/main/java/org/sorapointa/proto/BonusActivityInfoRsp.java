package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BonusActivityInfo.*;
import org.sorapointa.proto.BonusActivityInfo;

public class BonusActivityInfoRsp {
    @Tag(tag=2) public List<BonusActivityInfo> bonusActivityInfoList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
