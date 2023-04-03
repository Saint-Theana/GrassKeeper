package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryBlockReason.*;
import org.sorapointa.proto.DungeonEntryBlockReason;

public class DungeonEntryCond {
    @Tag(tag=14) public Integer condReason = null;
    @Tag(tag=12) public Integer param1 = null;
}
