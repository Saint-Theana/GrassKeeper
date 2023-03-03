package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MonsterRoute.*;
import org.sorapointa.proto.MonsterRoute;

public class MonsterPointArrayRouteUpdateNotify {
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=5) public MonsterRoute monsterRoute = null;
}
