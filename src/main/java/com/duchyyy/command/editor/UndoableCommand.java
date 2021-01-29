package com.duchyyy.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
