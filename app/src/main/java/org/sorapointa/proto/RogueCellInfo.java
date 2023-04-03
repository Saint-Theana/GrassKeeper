package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueCellState.*;
import org.sorapointa.proto.RogueCellState;

public class RogueCellInfo {
    @Tag(tag=8) public Integer cellConfigId = null;
    @Tag(tag=2) public Integer state = null;
    @Tag(tag=4) public Integer cellId = null;
    @Tag(tag=3) public Integer cellType = null;
    @Tag(tag=1) public Integer dungeonId = null;
}
