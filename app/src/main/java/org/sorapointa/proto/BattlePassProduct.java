package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassProduct {
    @Tag(tag=13) public String normalProductId = null;
    @Tag(tag=10) public String extraProductId = null;
    @Tag(tag=6) public String upgradeProductId = null;
}
