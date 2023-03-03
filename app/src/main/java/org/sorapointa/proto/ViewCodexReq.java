package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexTypeData.*;
import org.sorapointa.proto.CodexTypeData;

public class ViewCodexReq {
    @Tag(tag=10) public List<CodexTypeData> typeDataList = new ArrayList<>();
}
