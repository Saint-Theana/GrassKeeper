package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class GCGMsgUpdateController {
    @Tag(tag=3) public List<Uint32Pair> allowControllerMap = new ArrayList<>();
}
