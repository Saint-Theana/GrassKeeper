package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CombatTypeArgument.*;
import org.sorapointa.proto.CombatTypeArgument;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;

public class CombatInvokeEntry {
    @Tag(tag=12) public byte[] combatData = null;
    @Tag(tag=10) public Integer forwardType = null;
    @Tag(tag=11) public Integer argumentType = null;
}
