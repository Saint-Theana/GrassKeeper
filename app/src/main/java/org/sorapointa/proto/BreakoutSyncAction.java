package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BreakoutAction.*;
import org.sorapointa.proto.BreakoutAction;

public class BreakoutSyncAction {
    @Tag(tag=9) public BreakoutAction action = null;
}
