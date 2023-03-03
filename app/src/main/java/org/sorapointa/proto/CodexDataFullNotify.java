package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexTypeData.*;
import org.sorapointa.proto.CodexTypeData;

public class CodexDataFullNotify {
    @Tag(tag=4) public Integer lastReadPushtipsCodexId = null;
    @Tag(tag=2) public List<Integer> recentViewedPushtipsList = new ArrayList<>();
    @Tag(tag=3) public Integer lastReadPushtipsTypeId = null;
    @Tag(tag=6) public List<CodexTypeData> typeDataList = new ArrayList<>();
}
