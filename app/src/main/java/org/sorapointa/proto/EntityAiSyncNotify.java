package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AiSyncInfo.*;
import org.sorapointa.proto.AiSyncInfo;

public class EntityAiSyncNotify {
    @Tag(tag=15) public List<Integer> localAvatarAlertedMonsterList = new ArrayList<>();
    @Tag(tag=1) public List<AiSyncInfo> infoList = new ArrayList<>();
}
