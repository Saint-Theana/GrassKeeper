package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Item.*;
import org.sorapointa.proto.Item;
import org.sorapointa.proto.TrialAvatarGrantRecord.*;
import org.sorapointa.proto.TrialAvatarGrantRecord;

public class TrialAvatarInfo {
    @Tag(tag=1) public Integer trialAvatarId = null;
    @Tag(tag=2) public List<Item> trialEquipList = new ArrayList<>();
    @Tag(tag=3) public TrialAvatarGrantRecord grantRecord = null;
}
