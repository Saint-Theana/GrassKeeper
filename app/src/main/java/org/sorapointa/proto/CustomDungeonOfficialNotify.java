package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;
import org.sorapointa.proto.TryCustomDungeonType.*;
import org.sorapointa.proto.TryCustomDungeonType;

public class CustomDungeonOfficialNotify {
    @Tag(tag=9) public Integer tryType = null;
    @Tag(tag=14) public List<Integer> officialBlackCoinList = new ArrayList<>();
    @Tag(tag=15) public Integer enterType = null;
}
