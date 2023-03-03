package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueCellInfo.*;
import org.sorapointa.proto.RogueCellInfo;

public class RogueCellUpdateNotify {
    @Tag(tag=7) public RogueCellInfo cellInfo = null;
}
