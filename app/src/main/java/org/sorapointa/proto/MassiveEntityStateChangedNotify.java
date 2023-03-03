package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MassiveEntityState.*;
import org.sorapointa.proto.MassiveEntityState;

public class MassiveEntityStateChangedNotify {
    @Tag(tag=4) public List<MassiveEntityState> massiveEntityStateList = new ArrayList<>();
}
