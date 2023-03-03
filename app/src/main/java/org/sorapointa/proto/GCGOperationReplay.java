package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGOperationData.*;
import org.sorapointa.proto.GCGOperationData;

public class GCGOperationReplay {
    @Tag(tag=1) public Integer gameId = null;
    @Tag(tag=11) public Integer seed = null;
    @Tag(tag=9) public List<GCGOperationData> operationDataList = new ArrayList<>();
}
