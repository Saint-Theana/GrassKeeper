package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientCollectorData.*;
import org.sorapointa.proto.ClientCollectorData;

public class ClientCollectorDataNotify {
    @Tag(tag=13) public List<ClientCollectorData> clientCollectorDataList = new ArrayList<>();
}
