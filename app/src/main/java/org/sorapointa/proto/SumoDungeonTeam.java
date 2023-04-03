package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoDungeonAvatar.*;
import org.sorapointa.proto.SumoDungeonAvatar;

public class SumoDungeonTeam {
    @Tag(tag=4) public List<SumoDungeonAvatar> dungeonAvatarList = new ArrayList<>();
}
