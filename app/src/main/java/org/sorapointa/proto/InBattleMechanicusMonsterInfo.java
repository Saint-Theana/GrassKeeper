package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusMonsterInfo {
    @Tag(tag=1) public Integer monsterId = null;
    @Tag(tag=14) public Integer level = null;
    @Tag(tag=13) public Integer count = null;
}
