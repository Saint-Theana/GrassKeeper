package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class ActivityDisableTransferPointInteractionNotify {
    @Tag(tag=10) public Boolean isDisable = null;
    @Tag(tag=5) public Uint32Pair scenePointPair = null;
}
