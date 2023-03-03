package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDungeonPlayerCellChangeNotify {
    @Tag(tag=10) public Integer oldCellId = null;
    @Tag(tag=7) public Integer cellId = null;
}
