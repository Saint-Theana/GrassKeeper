package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassProduct {
    @Tag(tag=4) public String normalProductId = null;
    @Tag(tag=14) public String extraProductId = null;
    @Tag(tag=7) public String upgradeProductId = null;
}
