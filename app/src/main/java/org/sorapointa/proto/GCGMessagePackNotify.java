package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGMessagePack.*;
import org.sorapointa.proto.GCGMessagePack;

public class GCGMessagePackNotify {
    @Tag(tag=5) public Integer serverSeq = null;
    @Tag(tag=8) public GCGMessagePack messagePack = null;
}
