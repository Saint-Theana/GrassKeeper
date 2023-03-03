package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeon.*;
import org.sorapointa.proto.CustomDungeon;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;
import org.sorapointa.proto.TryCustomDungeonType.*;
import org.sorapointa.proto.TryCustomDungeonType;

public class CustomDungeonRecoverNotify {
    @Tag(tag=14) public Integer enterType = null;
    @Tag(tag=3) public Integer tryType = null;
    @Tag(tag=10) public CustomDungeon customDungeon = null;
    @Tag(tag=12) public List<Integer> officialBlackCoinList = new ArrayList<>();
}
