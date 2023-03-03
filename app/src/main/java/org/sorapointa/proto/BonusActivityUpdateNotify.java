package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BonusActivityInfo.*;
import org.sorapointa.proto.BonusActivityInfo;

public class BonusActivityUpdateNotify {
    @Tag(tag=8) public List<BonusActivityInfo> bonusActivityInfoList = new ArrayList<>();
}
