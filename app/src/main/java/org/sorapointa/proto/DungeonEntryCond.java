package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryBlockReason.*;
import org.sorapointa.proto.DungeonEntryBlockReason;

public class DungeonEntryCond {
    @Tag(tag=7) public Integer condReason = null;
    @Tag(tag=8) public Integer param1 = null;
}
