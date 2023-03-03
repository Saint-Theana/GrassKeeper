package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueCellState.*;
import org.sorapointa.proto.RogueCellState;

public class RogueCellInfo {
    @Tag(tag=14) public Integer cellConfigId = null;
    @Tag(tag=4) public Integer dungeonId = null;
    @Tag(tag=9) public Integer cellId = null;
    @Tag(tag=13) public Integer cellType = null;
    @Tag(tag=10) public Integer state = null;
}
