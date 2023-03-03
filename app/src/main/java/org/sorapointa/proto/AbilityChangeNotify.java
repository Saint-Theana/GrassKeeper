package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityControlBlock.*;
import org.sorapointa.proto.AbilityControlBlock;

public class AbilityChangeNotify {
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=15) public AbilityControlBlock abilityControlBlock = null;
}
